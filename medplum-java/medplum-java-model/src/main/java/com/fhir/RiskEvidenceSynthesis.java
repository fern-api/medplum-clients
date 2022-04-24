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
    as = ImmutableRiskEvidenceSynthesis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskEvidenceSynthesis {
  Optional<String> title();

  Optional<Period> effectivePeriod();

  Optional<RiskevidencesynthesisStatus> status();

  Optional<Narrative> text();

  Optional<List<ContactDetail>> contact();

  Optional<date> lastReviewDate();

  Optional<CodeableConcept> studyType();

  Optional<List<RiskEvidenceSynthesis_Certainty>> certainty();

  Optional<List<ContactDetail>> endorser();

  Reference outcome();

  Optional<RiskEvidenceSynthesis_SampleSize> sampleSize();

  Optional<List<UsageContext>> useContext();

  Optional<RiskEvidenceSynthesis_RiskEstimate> riskEstimate();

  Optional<dateTime> date();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<code> language();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<date> approvalDate();

  Optional<String> version();

  Reference population();

  Optional<uri> url();

  Optional<markdown> copyright();

  Optional<markdown> description();

  Optional<List<ContactDetail>> author();

  Optional<List<ContactDetail>> editor();

  Optional<CodeableConcept> synthesisType();

  Optional<Meta> meta();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<Reference> exposure();

  Optional<uri> implicitRules();

  Optional<String> name();

  Optional<id> id();

  Optional<List<Identifier>> identifier();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> topic();

  Optional<List<Extension>> modifierExtension();

  Optional<String> publisher();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactDetail>> reviewer();

  static ImmutableRiskEvidenceSynthesis.OutcomeBuildStage builder() {
    return ImmutableRiskEvidenceSynthesis.builder();
  }
}
