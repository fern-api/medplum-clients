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
    as = ImmutableQuestionnaire_Initial.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Questionnaire_Initial {
  Optional<List<Extension>> modifierExtension();

  Optional<Double> valueDecimal();

  Optional<String> valueDate();

  Optional<String> valueTime();

  Optional<Reference> valueReference();

  Optional<String> valueUri();

  Optional<Quantity> valueQuantity();

  Optional<String> valueString();

  Optional<String> valueDateTime();

  Optional<Boolean> valueBoolean();

  Optional<Attachment> valueAttachment();

  Optional<Coding> valueCoding();

  Optional<String> id();

  Optional<Double> valueInteger();

  Optional<List<Extension>> extension();

  static ImmutableQuestionnaire_Initial.Builder builder() {
    return ImmutableQuestionnaire_Initial.builder();
  }
}
