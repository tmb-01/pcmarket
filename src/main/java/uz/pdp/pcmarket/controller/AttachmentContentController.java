package uz.pdp.pcmarket.controller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.AttachmentContent;
import uz.pdp.pcmarket.payload.Result;
import uz.pdp.pcmarket.repository.AttachmentContentRepository;
import uz.pdp.pcmarket.service.AttachmentService;

import java.util.List;

@RestController
@RequestMapping("/attachment")
public class AttachmentContentController {

    @Autowired
    AttachmentService attachmentService;

    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    @SneakyThrows
    @PostMapping
    public Result add(@RequestBody MultipartHttpServletRequest multipartHttpServletRequest) {
        return attachmentService.add(multipartHttpServletRequest);
    }

    @GetMapping
    public List<Attachment> getAll() {
        return attachmentService.getAll();
    }

    @GetMapping("{id}")
    public AttachmentContent getById(@PathVariable Long id) {
        return attachmentService.getById(id);
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Long id) {
        return attachmentService.delete(id);
    }

}
