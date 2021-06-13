package uz.pdp.pcmarket.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.pcmarket.entity.*;
import uz.pdp.pcmarket.payload.Result;
import uz.pdp.pcmarket.repository.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    PropertyRepository propertyRepository;

    @SneakyThrows
    public Result add(Product product) {
        Optional<Attachment> attachmentById = attachmentRepository.findById(product.getAttachment().getId());
        Optional<Category> categoryById = categoryRepository.findById(product.getCategory().getId());

        if (attachmentById.isPresent()) {
            if (categoryById.isPresent()) {
                product.setAttachment(attachmentById.get());
                product.setCategory(categoryById.get());
                productRepository.save(product);
                return new Result("saved", true);
            }
            return new Result("category not exist", false);
        }
        return new Result("attachment not exist", false);
    }

    public Result put(Long id, Product product) {

        Optional<Product> productById = productRepository.findById(id);

        if (productById.isPresent()) {
            Optional<Attachment> attachmentById = attachmentRepository.findById(product.getAttachment().getId());
            Optional<Category> categoryById = categoryRepository.findById(product.getCategory().getId());

            if (attachmentById.isPresent()) {
                if (categoryById.isPresent()) {
                    product.setId(id);
                    product.setAttachment(attachmentById.get());
                    product.setCategory(categoryById.get());
                    productRepository.save(product);
                    return new Result("saved", true);
                }
                return new Result("category not exist", false);
            }
            return new Result("attachment not exist", false);
        }
        return new Result("product not exist", false);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public List<Product> getByFilter(List<Long> propertiesId) {
        return productRepository.getForFilter(propertiesId);
    }

    public Product getById(Long id) {
        return productRepository.getById(id);
    }

    public Result delete(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return new Result("Deleted", true);
        }
        return new Result("no product exist with this id", false);
    }
}
