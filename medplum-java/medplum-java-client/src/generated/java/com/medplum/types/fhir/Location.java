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
    as = ImmutableLocation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Location {
  Optional<Address> address();

  Optional<Meta> meta();

  Optional<Reference> managingOrganization();

  Optional<Uri> implicitRules();

  Optional<String> availabilityExceptions();

  Optional<List<String>> alias();

  Optional<List<CodeableConcept>> type();

  Optional<LocationStatus> status();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> partOf();

  Optional<LocationMode> mode();

  Optional<Location_Position> position();

  Optional<Code> language();

  Optional<CodeableConcept> physicalType();

  Optional<Coding> operationalStatus();

  Optional<List<Reference>> endpoint();

  Optional<Id> id();

  Optional<String> name();

  Optional<List<Identifier>> identifier();

  Optional<List<Location_HoursOfOperation>> hoursOfOperation();

  Optional<List<Extension>> extension();

  Optional<List<ContactPoint>> telecom();

  static ImmutableLocation.ResourceTypeBuildStage builder() {
    return ImmutableLocation.builder();
  }
}
