package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableQuestionnaireResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface QuestionnaireResponse {
  Optional<QuestionnaireresponseStatus> status();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> partOf();

  Optional<Reference> subject();

  Optional<Identifier> identifier();

  Optional<Reference> encounter();

  Optional<Reference> author();

  String resourceType();

  Optional<uri> implicitRules();

  Optional<Reference> source();

  Optional<Narrative> text();

  Optional<code> language();

  Optional<canonical> questionnaire();

  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<List<Reference>> basedOn();

  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> authored();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  static ImmutableQuestionnaireResponse.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaireResponse.builder();
  }
}
