package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Questionnaire_enablewhenOperator> operator();

  Optional<Double> answerInteger();

  Optional<String> answerDateTime();

  Optional<Coding> answerCoding();

  Optional<Double> answerDecimal();

  Optional<String> answerTime();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> answerQuantity();

  Optional<String> id();

  Optional<String> question();

  Optional<String> answerString();

  Optional<String> answerDate();

  Optional<Reference> answerReference();

  Optional<Boolean> answerBoolean();

  Optional<List<Extension>> extension();

  static ImmutableQuestionnaire_EnableWhen.Builder builder() {
    return ImmutableQuestionnaire_EnableWhen.builder();
  }
}
