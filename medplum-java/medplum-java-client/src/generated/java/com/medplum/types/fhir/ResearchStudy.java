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
    as = ImmutableResearchStudy.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchStudy {
  Optional<List<ResearchStudy_Objective>> objective();

  Optional<List<ResourceList>> contained();

  Optional<Markdown> description();

  Optional<Reference> sponsor();

  Optional<CodeableConcept> phase();

  Optional<List<Reference>> enrollment();

  Optional<ResearchstudyStatus> status();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResearchStudy_Arm>> arm();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<Period> period();

  String resourceType();

  Optional<CodeableConcept> primaryPurposeType();

  Optional<String> title();

  Optional<Reference> principalInvestigator();

  Optional<List<Reference>> protocol();

  Optional<List<CodeableConcept>> condition();

  Optional<List<CodeableConcept>> keyword();

  Optional<List<CodeableConcept>> focus();

  Optional<List<CodeableConcept>> location();

  Optional<CodeableConcept> reasonStopped();

  Optional<List<CodeableConcept>> category();

  Optional<Id> id();

  Optional<List<ContactDetail>> contact();

  Optional<List<Reference>> partOf();

  Optional<Narrative> text();

  Optional<List<Annotation>> note();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> site();

  static ImmutableResearchStudy.ResourceTypeBuildStage builder() {
    return ImmutableResearchStudy.builder();
  }
}
