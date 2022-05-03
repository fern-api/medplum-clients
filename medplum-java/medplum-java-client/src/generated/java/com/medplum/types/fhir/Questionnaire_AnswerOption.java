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
  Optional<Coding> valueCoding();

  Optional<List<Extension>> extension();

  Optional<Boolean> initialSelected();

  Optional<Reference> valueReference();

  Optional<String> valueString();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> valueInteger();

  Optional<String> valueTime();

  Optional<String> valueDate();

  static ImmutableQuestionnaire_AnswerOption.Builder builder() {
    return ImmutableQuestionnaire_AnswerOption.builder();
  }
}
