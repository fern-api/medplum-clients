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
  Optional<String> answerDate();

  Optional<Double> answerInteger();

  Optional<String> answerString();

  Optional<Coding> answerCoding();

  Optional<Boolean> answerBoolean();

  Optional<List<Extension>> extension();

  Optional<String> answerDateTime();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Questionnaire_enablewhenOperator> operator();

  Optional<String> answerTime();

  Optional<String> question();

  Optional<Quantity> answerQuantity();

  Optional<Reference> answerReference();

  Optional<Double> answerDecimal();

  static ImmutableQuestionnaire_EnableWhen.Builder builder() {
    return ImmutableQuestionnaire_EnableWhen.builder();
  }
}
