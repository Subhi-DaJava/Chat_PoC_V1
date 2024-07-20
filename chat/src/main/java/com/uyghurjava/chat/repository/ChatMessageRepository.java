package com.uyghurjava.chat.repository;

import com.uyghurjava.chat.models.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
}
