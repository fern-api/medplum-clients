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
  Optional<Coding> valueCoding();

  Optional<Quantity> valueQuantity();

  Optional<Double> valueDecimal();

  Optional<List<Extension>> extension();

  Optional<String> valueString();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> valueReference();

  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<Boolean> valueBoolean();

  Optional<Attachment> valueAttachment();

  Optional<String> valueDate();

  Optional<Double> valueInteger();

  Optional<String> valueDateTime();

  Optional<String> valueTime();

  Optional<String> valueUri();

  static ImmutableQuestionnaireResponse_Answer.Builder builder() {
    return ImmutableQuestionnaireResponse_Answer.builder();
  }
}
