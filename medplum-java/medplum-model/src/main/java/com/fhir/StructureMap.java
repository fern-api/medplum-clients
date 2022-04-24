package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Meta> meta();

  Optional<String> publisher();

  Optional<String> title();

  Optional<code> language();

  List<StructureMap_Group> group();

  @JsonProperty("import")
  Optional<List<canonical>> _import();

  Optional<List<ResourceList>> contained();

  Optional<markdown> copyright();

  Optional<List<Identifier>> identifier();

  Optional<dateTime> date();

  Optional<String> version();

  Optional<List<UsageContext>> useContext();

  Optional<List<StructureMap_Structure>> structure();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<ContactDetail>> contact();

  Optional<StructuremapStatus> status();

  Optional<uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> url();

  String resourceType();

  Optional<id> id();

  Optional<Boolean> experimental();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> name();

  Optional<markdown> purpose();

  Optional<markdown> description();

  static ImmutableStructureMap.ResourceTypeBuildStage builder() {
    return ImmutableStructureMap.builder();
  }
}
