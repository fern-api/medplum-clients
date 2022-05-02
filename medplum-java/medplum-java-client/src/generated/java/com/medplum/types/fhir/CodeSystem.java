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
    as = ImmutableCodeSystem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem {
  Optional<List<CodeSystem_Filter>> filter();

  Optional<UnsignedInt> count();

  Optional<String> title();

  Optional<List<Extension>> extension();

  Optional<String> publisher();

  Optional<CodesystemStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<CodeSystem_Concept>> concept();

  Optional<CodesystemHierarchymeaning> hierarchyMeaning();

  Optional<Canonical> valueSet();

  Optional<Narrative> text();

  Optional<Markdown> description();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> versionNeeded();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  Optional<List<ContactDetail>> contact();

  Optional<Meta> meta();

  Optional<Boolean> experimental();

  Optional<String> version();

  Optional<Markdown> purpose();

  Optional<Canonical> supplements();

  Optional<Code> language();

  Optional<Boolean> compositional();

  Optional<List<CodeSystem_Property>> property();

  Optional<Boolean> caseSensitive();

  String resourceType();

  Optional<Uri> url();

  Optional<Markdown> copyright();

  Optional<Uri> implicitRules();

  Optional<List<UsageContext>> useContext();

  Optional<CodesystemContent> content();

  Optional<DateTime> date();

  static ImmutableCodeSystem.ResourceTypeBuildStage builder() {
    return ImmutableCodeSystem.builder();
  }
}
