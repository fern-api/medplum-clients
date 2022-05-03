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
  Optional<CodeableConcept> type();

  Optional<PositiveInt> width();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> bodySite();

  Optional<CodeableConcept> view();

  Optional<List<Reference>> basedOn();

  Optional<String> deviceName();

  Optional<PositiveInt> frames();

  Optional<CodeableConcept> modality();

  Optional<Uri> implicitRules();

  Optional<Decimal> duration();

  Optional<PositiveInt> height();

  Optional<Code> status();

  Optional<Reference> subject();

  Attachment content();

  Optional<Code> language();

  Optional<List<Reference>> partOf();

  Optional<Narrative> text();

  String resourceType();

  Optional<Id> id();

  Optional<Reference> device();

  Optional<Instant> issued();

  Optional<Reference> encounter();

  Optional<List<Extension>> extension();

  Optional<Period> createdPeriod();

  Optional<String> createdDateTime();

  Optional<List<Annotation>> note();

  Optional<Meta> meta();

  Optional<Reference> operator();

  static ImmutableMedia.ContentBuildStage builder() {
    return ImmutableMedia.builder();
  }
}
