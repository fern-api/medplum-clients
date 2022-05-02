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
    as = ImmutableQuestionnaire_AnswerOption.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Questionnaire_AnswerOption {
  Optional<String> valueString();

  Optional<Coding> valueCoding();

  Optional<Double> valueInteger();

  Optional<String> valueDate();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueTime();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Reference> valueReference();

  Optional<Boolean> initialSelected();

  static ImmutableQuestionnaire_AnswerOption.Builder builder() {
    return ImmutableQuestionnaire_AnswerOption.builder();
  }
}
