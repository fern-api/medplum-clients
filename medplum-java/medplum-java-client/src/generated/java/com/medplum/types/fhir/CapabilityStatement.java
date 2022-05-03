package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCapabilityStatement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement {
  Optional<CapabilityStatement_Software> software();

  Optional<CapabilitystatementKind> kind();

  Optional<CapabilityStatement_Implementation> implementation();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<CapabilityStatement_Rest>> rest();

  Optional<List<CapabilityStatement_Document>> document();

  Optional<List<Canonical>> imports();

  Optional<Boolean> experimental();

  Optional<List<Code>> format();

  Optional<Markdown> purpose();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<DateTime> date();

  Optional<List<ContactDetail>> contact();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<CapabilitystatementStatus> status();

  Optional<List<ResourceList>> contained();

  Optional<List<Canonical>> implementationGuide();

  Optional<String> name();

  Optional<String> publisher();

  Optional<List<CapabilityStatement_Messaging>> messaging();

  Optional<Uri> url();

  Optional<List<Canonical>> instantiates();

  Optional<Code> language();

  Optional<Markdown> description();

  Optional<String> version();

  Optional<String> title();

  Optional<Markdown> copyright();

  Optional<List<UsageContext>> useContext();

  Optional<List<Code>> patchFormat();

  Optional<Narrative> text();

  Optional<CapabilitystatementFhirversion> fhirVersion();

  static ImmutableCapabilityStatement.ResourceTypeBuildStage builder() {
    return ImmutableCapabilityStatement.builder();
  }
}
