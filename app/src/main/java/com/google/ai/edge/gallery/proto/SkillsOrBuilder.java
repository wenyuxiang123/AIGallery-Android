package com.google.ai.edge.gallery.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;


public interface SkillsOrBuilder extends MessageLiteOrBuilder {
    Skill getSkill(int i);

    int getSkillCount();

    List<Skill> getSkillList();
}
