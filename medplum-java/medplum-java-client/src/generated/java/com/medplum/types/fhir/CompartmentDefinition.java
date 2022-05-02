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
    as = ImmutableCompartmentDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CompartmentDefinition {
  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<CompartmentdefinitionStatus> status();

  Optional<List<ContactDetail>> contact();

  Optional<DateTime> date();

  Optional<String> name();

  Optional<String> publisher();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<UsageContext>> useContext();

  Optional<List<CompartmentDefinition_Resource>> resource();

  Optional<Uri> url();

  Optional<CompartmentdefinitionCode> code();

  Optional<Uri> implicitRules();

  Optional<Markdown> purpose();

  Optional<Boolean> experimental();

  Optional<Markdown> description();

  Optional<Code> language();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> search();

  Optional<String> version();

  static ImmutableCompartmentDefinition.ResourceTypeBuildStage builder() {
    return ImmutableCompartmentDefinition.builder();
  }
}
