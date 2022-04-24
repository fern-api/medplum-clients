package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<markdown> description();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactDetail>> contact();

  Optional<CompartmentdefinitionStatus> status();

  String resourceType();

  Optional<dateTime> date();

  Optional<Narrative> text();

  Optional<Boolean> experimental();

  Optional<markdown> purpose();

  Optional<List<Extension>> modifierExtension();

  Optional<CompartmentdefinitionCode> code();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<uri> implicitRules();

  Optional<List<UsageContext>> useContext();

  Optional<String> publisher();

  Optional<code> language();

  Optional<String> version();

  Optional<Boolean> search();

  Optional<List<CompartmentDefinition_Resource>> resource();

  Optional<uri> url();

  static ImmutableCompartmentDefinition.ResourceTypeBuildStage builder() {
    return ImmutableCompartmentDefinition.builder();
  }
}
