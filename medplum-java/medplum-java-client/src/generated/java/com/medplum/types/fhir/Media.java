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

  Optional<Reference> subject();

  Optional<Meta> meta();

  Optional<CodeableConcept> view();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Attachment content();

  Optional<List<Reference>> basedOn();

  Optional<PositiveInt> width();

  Optional<Reference> encounter();

  Optional<String> createdDateTime();

  Optional<Reference> device();

  Optional<CodeableConcept> bodySite();

  Optional<PositiveInt> height();

  Optional<List<Annotation>> note();

  String resourceType();

  Optional<Decimal> duration();

  Optional<List<Extension>> modifierExtension();

  Optional<PositiveInt> frames();

  Optional<List<Identifier>> identifier();

  Optional<Period> createdPeriod();

  Optional<Code> status();

  Optional<String> deviceName();

  Optional<List<Reference>> partOf();

  Optional<Instant> issued();

  Optional<Reference> operator();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> modality();

  Optional<Id> id();

  static ImmutableMedia.ContentBuildStage builder() {
    return ImmutableMedia.builder();
  }
}
