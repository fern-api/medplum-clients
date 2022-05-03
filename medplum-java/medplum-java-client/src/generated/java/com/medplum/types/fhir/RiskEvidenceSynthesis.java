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
    as = ImmutableRiskEvidenceSynthesis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskEvidenceSynthesis {
  Optional<Period> effectivePeriod();

  Optional<Markdown> description();

  Optional<String> version();

  Optional<Date> lastReviewDate();

  Optional<List<ContactDetail>> endorser();

  Optional<RiskEvidenceSynthesis_RiskEstimate> riskEstimate();

  Optional<Uri> url();

  Optional<List<ContactDetail>> contact();

  Optional<List<Identifier>> identifier();

  Optional<Uri> implicitRules();

  Optional<Markdown> copyright();

  Optional<List<ContactDetail>> author();

  Optional<CodeableConcept> synthesisType();

  Optional<List<RiskEvidenceSynthesis_Certainty>> certainty();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ContactDetail>> editor();

  Optional<CodeableConcept> studyType();

  Reference population();

  Optional<RiskEvidenceSynthesis_SampleSize> sampleSize();

  Reference outcome();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<String> title();

  Optional<RiskevidencesynthesisStatus> status();

  String resourceType();

  Optional<Date> approvalDate();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  Optional<Id> id();

  Optional<String> publisher();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<DateTime> date();

  Optional<List<Extension>> extension();

  Optional<Reference> exposure();

  Optional<List<ResourceList>> contained();

  Optional<List<Annotation>> note();

  Optional<String> name();

  static ImmutableRiskEvidenceSynthesis.PopulationBuildStage builder() {
    return ImmutableRiskEvidenceSynthesis.builder();
  }
}
