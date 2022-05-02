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
  List<StructureMap_Group> group();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<String> name();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> contact();

  Optional<List<StructureMap_Structure>> structure();

  Optional<DateTime> date();

  @JsonProperty("import")
  Optional<List<Canonical>> _import();

  Optional<Markdown> purpose();

  Optional<Markdown> copyright();

  Optional<Uri> url();

  Optional<Boolean> experimental();

  Optional<List<UsageContext>> useContext();

  Optional<String> title();

  Optional<String> publisher();

  Optional<StructuremapStatus> status();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<String> version();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> jurisdiction();

  String resourceType();

  static ImmutableStructureMap.ResourceTypeBuildStage builder() {
    return ImmutableStructureMap.builder();
  }
}
