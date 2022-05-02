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
  Optional<Uri> url();

  Optional<Narrative> text();

  Optional<DateTime> date();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> author();

  Optional<RiskEvidenceSynthesis_SampleSize> sampleSize();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Meta> meta();

  Optional<Reference> exposure();

  Reference outcome();

  Optional<List<ContactDetail>> endorser();

  Optional<String> publisher();

  Optional<List<UsageContext>> useContext();

  Optional<List<Annotation>> note();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> synthesisType();

  Optional<RiskevidencesynthesisStatus> status();

  Optional<Date> lastReviewDate();

  Optional<String> title();

  Optional<Date> approvalDate();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactDetail>> editor();

  Optional<RiskEvidenceSynthesis_RiskEstimate> riskEstimate();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Period> effectivePeriod();

  Optional<Code> language();

  Optional<List<ContactDetail>> contact();

  Optional<Markdown> copyright();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<CodeableConcept> studyType();

  Optional<String> name();

  Optional<Markdown> description();

  Optional<String> version();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<RiskEvidenceSynthesis_Certainty>> certainty();

  Optional<List<CodeableConcept>> topic();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Reference population();

  static ImmutableRiskEvidenceSynthesis.OutcomeBuildStage builder() {
    return ImmutableRiskEvidenceSynthesis.builder();
  }
}
