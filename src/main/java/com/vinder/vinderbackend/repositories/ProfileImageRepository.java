package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.image.ProfileImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileImageRepository extends JpaRepository<ProfileImage, Long> {
}
