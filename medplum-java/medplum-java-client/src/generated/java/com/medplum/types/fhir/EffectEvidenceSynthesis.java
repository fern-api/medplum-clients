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
  Reference exposure();

  Optional<List<ContactDetail>> endorser();

  Optional<List<Annotation>> note();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<String> title();

  Optional<EffectevidencesynthesisStatus> status();

  Optional<List<ContactDetail>> editor();

  Optional<CodeableConcept> studyType();

  Optional<Meta> meta();

  Optional<List<ContactDetail>> author();

  Optional<Uri> url();

  Optional<List<Identifier>> identifier();

  Optional<String> name();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<Date> lastReviewDate();

  Optional<Id> id();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<CodeableConcept>> topic();

  Reference population();

  Optional<Date> approvalDate();

  Optional<CodeableConcept> synthesisType();

  Reference exposureAlternative();

  Optional<List<ContactDetail>> contact();

  Optional<List<UsageContext>> useContext();

  Optional<List<EffectEvidenceSynthesis_Certainty>> certainty();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> reviewer();

  Reference outcome();

  Optional<List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure();

  Optional<EffectEvidenceSynthesis_SampleSize> sampleSize();

  Optional<Narrative> text();

  Optional<Period> effectivePeriod();

  Optional<DateTime> date();

  Optional<String> publisher();

  Optional<List<Extension>> extension();

  Optional<String> version();

  Optional<Markdown> copyright();

  Optional<Markdown> description();

  Optional<List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate();

  static ImmutableEffectEvidenceSynthesis.ExposureBuildStage builder() {
    return ImmutableEffectEvidenceSynthesis.builder();
  }
}
