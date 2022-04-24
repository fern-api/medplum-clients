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
    as = ImmutableQuestionnaire_Initial.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Questionnaire_Initial {
  Optional<String> valueUri();

  Optional<String> valueDateTime();

  Optional<Coding> valueCoding();

  Optional<Double> valueDecimal();

  Optional<String> valueString();

  Optional<Boolean> valueBoolean();

  Optional<Double> valueInteger();

  Optional<String> valueDate();

  Optional<String> valueTime();

  Optional<Quantity> valueQuantity();

  Optional<Attachment> valueAttachment();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> valueReference();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableQuestionnaire_Initial.Builder builder() {
    return ImmutableQuestionnaire_Initial.builder();
  }
}
