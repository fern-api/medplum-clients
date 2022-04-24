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
    as = ImmutableSpecimen.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Specimen {
  Optional<List<CodeableConcept>> condition();

  Optional<List<Annotation>> note();

  Optional<Identifier> accessionIdentifier();

  Optional<Meta> meta();

  Optional<CodeableConcept> type();

  Optional<List<Specimen_Container>> container();

  Optional<id> id();

  Optional<List<Reference>> parent();

  Optional<List<Specimen_Processing>> processing();

  Optional<uri> implicitRules();

  Optional<Narrative> text();

  Optional<Reference> subject();

  Optional<dateTime> receivedTime();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<SpecimenStatus> status();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> request();

  Optional<Specimen_Collection> collection();

  Optional<code> language();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSpecimen.ResourceTypeBuildStage builder() {
    return ImmutableSpecimen.builder();
  }
}
