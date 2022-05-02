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
    as = ImmutableMedia.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Media {
  Optional<String> deviceName();

  Optional<Code> language();

  Optional<Reference> operator();

  Optional<List<ResourceList>> contained();

  Optional<Period> createdPeriod();

  Optional<CodeableConcept> bodySite();

  Optional<CodeableConcept> modality();

  String resourceType();

  Optional<Reference> subject();

  Optional<Reference> device();

  Optional<Code> status();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<Instant> issued();

  Optional<CodeableConcept> view();

  Optional<Meta> meta();

  Optional<String> createdDateTime();

  Optional<Narrative> text();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> basedOn();

  Optional<List<Annotation>> note();

  Optional<PositiveInt> width();

  Optional<Decimal> duration();

  Optional<List<Identifier>> identifier();

  Optional<PositiveInt> height();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Reference> encounter();

  Attachment content();

  Optional<PositiveInt> frames();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  static ImmutableMedia.ResourceTypeBuildStage builder() {
    return ImmutableMedia.builder();
  }
}
