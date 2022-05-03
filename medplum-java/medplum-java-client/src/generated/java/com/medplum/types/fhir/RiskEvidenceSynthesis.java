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
  Optional<List<ResourceList>> contained();

  Optional<List<ContactDetail>> contact();

  Optional<List<CodeableConcept>> topic();

  Optional<CodeableConcept> synthesisType();

  Optional<RiskEvidenceSynthesis_SampleSize> sampleSize();

  Optional<List<ContactDetail>> editor();

  Optional<Id> id();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> endorser();

  Optional<Uri> implicitRules();

  Optional<Date> approvalDate();

  Optional<String> publisher();

  Optional<RiskEvidenceSynthesis_RiskEstimate> riskEstimate();

  Optional<List<UsageContext>> useContext();

  Optional<List<Annotation>> note();

  Optional<Reference> exposure();

  Optional<Meta> meta();

  Optional<Markdown> description();

  Optional<String> name();

  Optional<Date> lastReviewDate();

  Optional<List<RiskEvidenceSynthesis_Certainty>> certainty();

  Optional<RiskevidencesynthesisStatus> status();

  Optional<Narrative> text();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> version();

  Optional<List<ContactDetail>> author();

  Optional<Period> effectivePeriod();

  Optional<CodeableConcept> studyType();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Extension>> modifierExtension();

  Reference outcome();

  Optional<List<Identifier>> identifier();

  Optional<Markdown> copyright();

  Optional<DateTime> date();

  Reference population();

  String resourceType();

  Optional<String> title();

  Optional<Uri> url();

  static ImmutableRiskEvidenceSynthesis.OutcomeBuildStage builder() {
    return ImmutableRiskEvidenceSynthesis.builder();
  }
}
