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
    as = ImmutableEffectEvidenceSynthesis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis {
  Optional<uri> implicitRules();

  Optional<List<EffectEvidenceSynthesis_Certainty>> certainty();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<EffectEvidenceSynthesis_SampleSize> sampleSize();

  String resourceType();

  Optional<markdown> description();

  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> author();

  Optional<String> title();

  Optional<EffectevidencesynthesisStatus> status();

  Optional<Period> effectivePeriod();

  Optional<List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure();

  Optional<CodeableConcept> synthesisType();

  Optional<List<Identifier>> identifier();

  Optional<List<ContactDetail>> endorser();

  Optional<id> id();

  Optional<List<Annotation>> note();

  Optional<List<ContactDetail>> editor();

  Optional<String> name();

  Reference outcome();

  Optional<CodeableConcept> studyType();

  Optional<date> approvalDate();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> version();

  Optional<List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate();

  Optional<uri> url();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<code> language();

  Optional<markdown> copyright();

  Optional<date> lastReviewDate();

  Reference population();

  Reference exposure();

  Optional<Meta> meta();

  Optional<dateTime> date();

  Optional<List<ContactDetail>> contact();

  Optional<List<CodeableConcept>> topic();

  Reference exposureAlternative();

  Optional<String> publisher();

  static ImmutableEffectEvidenceSynthesis.ResourceTypeBuildStage builder() {
    return ImmutableEffectEvidenceSynthesis.builder();
  }
}
