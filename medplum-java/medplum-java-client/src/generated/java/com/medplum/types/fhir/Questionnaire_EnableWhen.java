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
  Optional<String> id();

  Optional<Double> answerDecimal();

  Optional<String> answerDate();

  Optional<Quantity> answerQuantity();

  Optional<Coding> answerCoding();

  Optional<Boolean> answerBoolean();

  Optional<Reference> answerReference();

  Optional<String> answerDateTime();

  Optional<Double> answerInteger();

  Optional<List<Extension>> extension();

  Optional<String> answerString();

  Optional<String> question();

  Optional<List<Extension>> modifierExtension();

  Optional<String> answerTime();

  Optional<Questionnaire_enablewhenOperator> operator();

  static ImmutableQuestionnaire_EnableWhen.Builder builder() {
    return ImmutableQuestionnaire_EnableWhen.builder();
  }
}
