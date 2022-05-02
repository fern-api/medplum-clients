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
  Optional<List<Reference>> partOf();

  Optional<CodeableConcept> bodySite();

  Optional<PositiveInt> width();

  Optional<Code> language();

  Optional<String> deviceName();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Reference> subject();

  Optional<PositiveInt> frames();

  Optional<List<ResourceList>> contained();

  Optional<Period> createdPeriod();

  Optional<Decimal> duration();

  Optional<Id> id();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> view();

  Optional<Reference> device();

  Optional<List<Identifier>> identifier();

  Optional<Code> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> basedOn();

  Optional<CodeableConcept> modality();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Annotation>> note();

  Optional<Instant> issued();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<String> createdDateTime();

  Optional<Reference> operator();

  Optional<Meta> meta();

  Optional<PositiveInt> height();

  Optional<Reference> encounter();

  Attachment content();

  static ImmutableMedia.ResourceTypeBuildStage builder() {
    return ImmutableMedia.builder();
  }
}
