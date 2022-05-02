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
    as = ImmutableQuestionnaireResponse_Answer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface QuestionnaireResponse_Answer {
  Optional<String> valueDate();

  Optional<String> valueTime();

  Optional<Double> valueDecimal();

  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<String> valueDateTime();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> valueQuantity();

  Optional<Coding> valueCoding();

  Optional<Attachment> valueAttachment();

  Optional<Boolean> valueBoolean();

  Optional<Double> valueInteger();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Reference> valueReference();

  Optional<String> valueString();

  Optional<String> valueUri();

  static ImmutableQuestionnaireResponse_Answer.Builder builder() {
    return ImmutableQuestionnaireResponse_Answer.builder();
  }
}
