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
    as = ImmutableDevice.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device {
  Optional<String> partNumber();

  Optional<List<Annotation>> note();

  Optional<String> modelNumber();

  Optional<List<Device_UdiCarrier>> udiCarrier();

  Optional<List<Device_Property>> property();

  Optional<DateTime> expirationDate();

  Optional<Uri> url();

  Optional<List<CodeableConcept>> safety();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<Code> language();

  Optional<Reference> owner();

  Optional<List<CodeableConcept>> statusReason();

  Optional<Uri> implicitRules();

  Optional<Reference> location();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Reference> definition();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<Device_DeviceName>> deviceName();

  Optional<String> distinctIdentifier();

  Optional<Id> id();

  Optional<String> lotNumber();

  Optional<List<Extension>> extension();

  Optional<Reference> patient();

  Optional<List<Device_Version>> version();

  Optional<DateTime> manufactureDate();

  Optional<List<Device_Specialization>> specialization();

  Optional<Reference> parent();

  Optional<String> serialNumber();

  Optional<String> manufacturer();

  Optional<List<ContactPoint>> contact();

  Optional<DeviceStatus> status();

  static ImmutableDevice.ResourceTypeBuildStage builder() {
    return ImmutableDevice.builder();
  }
}
