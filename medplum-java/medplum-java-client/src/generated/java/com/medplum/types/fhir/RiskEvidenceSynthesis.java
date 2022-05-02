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
  Optional<List<ContactDetail>> reviewer();

  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> url();

  Optional<Date> approvalDate();

  Optional<List<Annotation>> note();

  Optional<Date> lastReviewDate();

  Optional<List<RiskEvidenceSynthesis_Certainty>> certainty();

  Optional<Period> effectivePeriod();

  Optional<List<CodeableConcept>> topic();

  Optional<String> publisher();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ContactDetail>> author();

  Optional<List<Identifier>> identifier();

  Optional<Uri> implicitRules();

  Optional<String> version();

  Optional<CodeableConcept> studyType();

  Optional<Reference> exposure();

  Optional<CodeableConcept> synthesisType();

  Optional<RiskEvidenceSynthesis_RiskEstimate> riskEstimate();

  Optional<RiskevidencesynthesisStatus> status();

  Optional<Id> id();

  String resourceType();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> endorser();

  Optional<Meta> meta();

  Optional<String> title();

  Optional<RiskEvidenceSynthesis_SampleSize> sampleSize();

  Optional<List<Extension>> extension();

  Optional<List<UsageContext>> useContext();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Reference population();

  Optional<Narrative> text();

  Optional<Markdown> copyright();

  Optional<Code> language();

  Optional<List<ContactDetail>> editor();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> date();

  Optional<List<ContactDetail>> contact();

  Reference outcome();

  static ImmutableRiskEvidenceSynthesis.ResourceTypeBuildStage builder() {
    return ImmutableRiskEvidenceSynthesis.builder();
  }
}
