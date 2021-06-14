package uz.pdp.pcmarket.controller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.AttachmentContent;
import uz.pdp.pcmarket.entity.Product;
import uz.pdp.pcmarket.entity.Property;
import uz.pdp.pcmarket.payload.Result;
import uz.pdp.pcmarket.repository.AttachmentContentRepository;
import uz.pdp.pcmarket.repository.ProductRepository;
import uz.pdp.pcmarket.service.AttachmentService;
import uz.pdp.pcmarket.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    AttachmentService attachmentService;

    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    @Autowired
    ProductService productService;

//    @PreAuthorize("hasAnyRole(MODERATOR,SUPER_ADMIN,OPERATOR)")
    @PostMapping
    public Result add(@RequestBody Product product) {
        return productService.add(product);
    }

//    @PreAuthorize("hasAnyRole(MODERATOR,SUPER_ADMIN)")
    @PutMapping
    public Result update(@PathVariable Long id, @RequestBody Product product) {
        return productService.put(id, product);
    }

//    @PreAuthorize("hasAnyRole(SUPER_ADMIN,MODERATOR,OPERATOR)")
    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

//    @PreAuthorize("hasAnyRole(SUPER_ADMIN,MODERATOR,OPERATOR)")
    @GetMapping("/filter")
    public List<Product> getByFilter(@RequestBody List<Long> id) {
        return productService.getByFilter(id);
    }

//    @PreAuthorize("hasAnyRole(SUPER_ADMIN,MODERATOR,OPERATOR)")
    @GetMapping("{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getById(id);
    }

//    @PreAuthorize("hasAnyRole(SUPER_ADMIN)")
    @DeleteMapping("{id}")
    public Result delete(@PathVariable Long id) {
        return productService.delete(id);
    }
}
