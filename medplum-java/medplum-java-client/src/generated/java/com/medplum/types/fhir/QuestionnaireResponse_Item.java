package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableQuestionnaireResponse_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface QuestionnaireResponse_Item {
  Optional<Uri> definition();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> text();

  Optional<List<Extension>> modifierExtension();

  Optional<String> linkId();

  Optional<List<QuestionnaireResponse_Answer>> answer();

  Optional<List<QuestionnaireResponse_Item>> item();

  static ImmutableQuestionnaireResponse_Item.Builder builder() {
    return ImmutableQuestionnaireResponse_Item.builder();
  }
}
