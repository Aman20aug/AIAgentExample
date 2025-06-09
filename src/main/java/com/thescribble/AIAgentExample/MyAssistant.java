package com.thescribble.AIAgentExample;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import org.springframework.context.annotation.Primary;

@AiService
public interface MyAssistant {

    @SystemMessage({
            "You are a helpful AI assistant. You can answer questions like provide weather information.",
            "If you need to use a tool, always output the exact function call including parameters.",
            "If the user asks a question that requires a weather information, use the available tools."
    })
    String chat(@MemoryId Object memoryId, @UserMessage String userMessage);
}
