package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pcmarket.entity.AttachmentContent;

import java.util.List;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Long> {
    AttachmentContent findAllByAttachment_Id(Long attachment_id);

    void deleteByAttachment_Id(Long attachment_id);

}
