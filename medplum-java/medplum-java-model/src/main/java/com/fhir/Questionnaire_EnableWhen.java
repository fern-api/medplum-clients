package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableQuestionnaire_EnableWhen.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Questionnaire_EnableWhen {
  Optional<String> answerDate();

  Optional<Coding> answerCoding();

  Optional<String> question();

  Optional<String> answerString();

  Optional<Questionnaire_enablewhenOperator> operator();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> answerTime();

  Optional<List<Extension>> extension();

  Optional<String> answerDateTime();

  Optional<Double> answerInteger();

  Optional<Quantity> answerQuantity();

  Optional<Boolean> answerBoolean();

  Optional<Double> answerDecimal();

  Optional<Reference> answerReference();

  static ImmutableQuestionnaire_EnableWhen.Builder builder() {
    return ImmutableQuestionnaire_EnableWhen.builder();
  }
}
