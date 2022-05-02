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
  Reference population();

  Optional<Markdown> description();

  Optional<List<ResourceList>> contained();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Meta> meta();

  Optional<EffectevidencesynthesisStatus> status();

  Optional<String> version();

  Optional<List<Annotation>> note();

  Optional<Markdown> copyright();

  Optional<List<ContactDetail>> editor();

  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> author();

  Optional<Uri> url();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ContactDetail>> endorser();

  Reference outcome();

  Optional<CodeableConcept> synthesisType();

  Optional<Narrative> text();

  Optional<List<ContactDetail>> contact();

  Optional<Id> id();

  Optional<Date> approvalDate();

  Optional<String> publisher();

  Optional<EffectEvidenceSynthesis_SampleSize> sampleSize();

  Optional<CodeableConcept> studyType();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> reviewer();

  Reference exposureAlternative();

  Optional<String> title();

  Optional<List<CodeableConcept>> topic();

  Optional<List<Extension>> extension();

  Optional<Date> lastReviewDate();

  Optional<DateTime> date();

  Optional<Code> language();

  Optional<String> name();

  Optional<List<Identifier>> identifier();

  Optional<List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Uri> implicitRules();

  Reference exposure();

  String resourceType();

  Optional<List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure();

  Optional<List<EffectEvidenceSynthesis_Certainty>> certainty();

  static ImmutableEffectEvidenceSynthesis.PopulationBuildStage builder() {
    return ImmutableEffectEvidenceSynthesis.builder();
  }
}
