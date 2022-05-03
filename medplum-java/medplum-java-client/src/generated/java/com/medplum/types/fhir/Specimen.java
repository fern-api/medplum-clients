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
    as = ImmutableSpecimen.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Specimen {
  Optional<Id> id();

  Optional<List<CodeableConcept>> condition();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Specimen_Processing>> processing();

  Optional<Reference> subject();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<Identifier> accessionIdentifier();

  Optional<DateTime> receivedTime();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Code> language();

  Optional<List<Reference>> parent();

  Optional<Uri> implicitRules();

  Optional<List<Annotation>> note();

  Optional<SpecimenStatus> status();

  Optional<CodeableConcept> type();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> request();

  Optional<Specimen_Collection> collection();

  Optional<List<Specimen_Container>> container();

  static ImmutableSpecimen.ResourceTypeBuildStage builder() {
    return ImmutableSpecimen.builder();
  }
}
