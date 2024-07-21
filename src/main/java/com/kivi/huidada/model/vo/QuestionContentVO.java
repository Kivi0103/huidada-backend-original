package com.kivi.huidada.model.vo;

import com.kivi.huidada.model.dto.test_paper.QuestionItem;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class QuestionContentVO implements Serializable {
    private Long testPaperId;
    private List<QuestionItem> questionContent;
    private static final long serialVersionUID = 1L;
}
