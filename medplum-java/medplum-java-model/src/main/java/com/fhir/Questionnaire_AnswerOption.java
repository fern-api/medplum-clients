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
    as = ImmutableQuestionnaire_AnswerOption.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Questionnaire_AnswerOption {
  Optional<Coding> valueCoding();

  Optional<String> valueTime();

  Optional<Double> valueInteger();

  Optional<Reference> valueReference();

  Optional<List<Extension>> extension();

  Optional<Boolean> initialSelected();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueDate();

  Optional<String> valueString();

  Optional<String> id();

  static ImmutableQuestionnaire_AnswerOption.Builder builder() {
    return ImmutableQuestionnaire_AnswerOption.builder();
  }
}
