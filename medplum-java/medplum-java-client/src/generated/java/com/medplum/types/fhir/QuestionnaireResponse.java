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
    as = ImmutableQuestionnaireResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface QuestionnaireResponse {
  Optional<Uri> implicitRules();

  Optional<Canonical> questionnaire();

  Optional<List<Extension>> modifierExtension();

  Optional<QuestionnaireresponseStatus> status();

  Optional<List<Reference>> partOf();

  Optional<Code> language();

  Optional<Reference> source();

  Optional<Reference> subject();

  Optional<Reference> encounter();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<DateTime> authored();

  Optional<Narrative> text();

  Optional<Identifier> identifier();

  Optional<List<Reference>> basedOn();

  Optional<Reference> author();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<QuestionnaireResponse_Item>> item();

  static ImmutableQuestionnaireResponse.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaireResponse.builder();
  }
}
