package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    as = ImmutableStructureMap.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap {
  Optional<Markdown> description();

  Optional<List<StructureMap_Structure>> structure();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> experimental();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> contact();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Uri> url();

  Optional<Markdown> copyright();

  Optional<List<Identifier>> identifier();

  Optional<String> version();

  Optional<Uri> implicitRules();

  Optional<String> name();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<DateTime> date();

  Optional<String> publisher();

  @JsonProperty("import")
  Optional<List<Canonical>> _import();

  Optional<Markdown> purpose();

  Optional<String> title();

  List<StructureMap_Group> group();

  Optional<StructuremapStatus> status();

  Optional<Code> language();

  static ImmutableStructureMap.ResourceTypeBuildStage builder() {
    return ImmutableStructureMap.builder();
  }
}
