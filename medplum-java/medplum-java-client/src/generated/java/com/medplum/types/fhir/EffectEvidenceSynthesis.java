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
    as = ImmutableEffectEvidenceSynthesis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis {
  Optional<List<EffectEvidenceSynthesis_Certainty>> certainty();

  Optional<Date> lastReviewDate();

  String resourceType();

  Optional<Uri> url();

  Optional<DateTime> date();

  Reference exposure();

  Optional<EffectEvidenceSynthesis_SampleSize> sampleSize();

  Optional<List<ContactDetail>> editor();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> copyright();

  Optional<CodeableConcept> studyType();

  Optional<Markdown> description();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Reference exposureAlternative();

  Optional<List<ContactDetail>> endorser();

  Optional<CodeableConcept> synthesisType();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Reference outcome();

  Optional<List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure();

  Optional<EffectevidencesynthesisStatus> status();

  Optional<String> name();

  Optional<List<ResourceList>> contained();

  Optional<List<Annotation>> note();

  Optional<Code> language();

  Reference population();

  Optional<List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate();

  Optional<List<UsageContext>> useContext();

  Optional<Date> approvalDate();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Extension>> modifierExtension();

  Optional<String> publisher();

  Optional<List<ContactDetail>> author();

  Optional<List<ContactDetail>> reviewer();

  Optional<Narrative> text();

  Optional<Period> effectivePeriod();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ContactDetail>> contact();

  Optional<String> version();

  Optional<List<Identifier>> identifier();

  static ImmutableEffectEvidenceSynthesis.ResourceTypeBuildStage builder() {
    return ImmutableEffectEvidenceSynthesis.builder();
  }
}
