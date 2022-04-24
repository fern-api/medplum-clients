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
    as = ImmutableMedia.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Media {
  Optional<List<ResourceList>> contained();

  Optional<String> deviceName();

  Optional<instant> issued();

  Optional<Period> createdPeriod();

  Optional<id> id();

  Optional<List<Annotation>> note();

  Optional<String> createdDateTime();

  String resourceType();

  Optional<Reference> subject();

  Attachment content();

  Optional<code> language();

  Optional<List<Reference>> basedOn();

  Optional<Reference> encounter();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> partOf();

  Optional<CodeableConcept> bodySite();

  Optional<List<Extension>> modifierExtension();

  Optional<code> status();

  Optional<positiveInt> frames();

  Optional<Reference> device();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<CodeableConcept> modality();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<positiveInt> width();

  Optional<decimal> duration();

  Optional<Narrative> text();

  Optional<CodeableConcept> view();

  Optional<uri> implicitRules();

  Optional<positiveInt> height();

  Optional<CodeableConcept> type();

  Optional<Reference> operator();

  static ImmutableMedia.ResourceTypeBuildStage builder() {
    return ImmutableMedia.builder();
  }
}
