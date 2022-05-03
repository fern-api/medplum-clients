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

  Optional<List<ResearchStudy_Arm>> arm();

  Optional<Code> language();

  Optional<List<CodeableConcept>> location();

  Optional<List<CodeableConcept>> condition();

  Optional<List<CodeableConcept>> category();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Period> period();

  Optional<Reference> principalInvestigator();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> site();

  Optional<CodeableConcept> primaryPurposeType();

  Optional<Meta> meta();

  Optional<CodeableConcept> reasonStopped();

  Optional<List<ContactDetail>> contact();

  Optional<CodeableConcept> phase();

  Optional<List<Reference>> protocol();

  Optional<List<Reference>> enrollment();

  Optional<Markdown> description();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Id> id();

  Optional<List<CodeableConcept>> focus();

  Optional<String> title();

  Optional<List<Annotation>> note();

  Optional<Reference> sponsor();

  Optional<ResearchstudyStatus> status();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> keyword();

  static ImmutableResearchStudy.ResourceTypeBuildStage builder() {
    return ImmutableResearchStudy.builder();
  }
}
