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
  Optional<Identifier> identifier();

  String resourceType();

  Optional<Reference> author();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> basedOn();

  Optional<QuestionnaireresponseStatus> status();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Reference> encounter();

  Optional<Reference> source();

  Optional<Canonical> questionnaire();

  Optional<DateTime> authored();

  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<List<Extension>> extension();

  Optional<Reference> subject();

  static ImmutableQuestionnaireResponse.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaireResponse.builder();
  }
}
