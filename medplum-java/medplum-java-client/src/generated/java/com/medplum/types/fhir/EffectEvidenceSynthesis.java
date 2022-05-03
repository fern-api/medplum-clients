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
  Optional<List<RelatedArtifact>> relatedArtifact();

  Reference exposure();

  Optional<DateTime> date();

  Optional<List<ResourceList>> contained();

  Optional<EffectEvidenceSynthesis_SampleSize> sampleSize();

  Optional<List<Annotation>> note();

  Optional<List<UsageContext>> useContext();

  Optional<EffectevidencesynthesisStatus> status();

  Optional<List<Extension>> extension();

  Optional<Markdown> copyright();

  Optional<Uri> url();

  Reference outcome();

  Optional<String> publisher();

  Optional<Id> id();

  Optional<List<ContactDetail>> endorser();

  Optional<Narrative> text();

  Reference population();

  Reference exposureAlternative();

  Optional<Date> approvalDate();

  Optional<String> version();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> studyType();

  Optional<List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate();

  Optional<List<ContactDetail>> reviewer();

  Optional<CodeableConcept> synthesisType();

  Optional<List<Extension>> modifierExtension();

  Optional<Date> lastReviewDate();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> contact();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> topic();

  Optional<List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure();

  Optional<List<EffectEvidenceSynthesis_Certainty>> certainty();

  Optional<List<ContactDetail>> author();

  String resourceType();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> name();

  Optional<String> title();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> editor();

  static ImmutableEffectEvidenceSynthesis.ExposureBuildStage builder() {
    return ImmutableEffectEvidenceSynthesis.builder();
  }
}
