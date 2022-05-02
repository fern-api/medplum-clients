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
    as = ImmutableNamingSystem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NamingSystem {
  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<String> name();

  Optional<List<UsageContext>> useContext();

  Optional<NamingsystemKind> kind();

  Optional<String> responsible();

  Optional<CodeableConcept> type();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> jurisdiction();

  List<NamingSystem_UniqueId> uniqueId();

  Optional<List<Extension>> modifierExtension();

  Optional<String> publisher();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<NamingsystemStatus> status();

  Optional<DateTime> date();

  Optional<Markdown> description();

  Optional<String> usage();

  String resourceType();

  Optional<List<ContactDetail>> contact();

  static ImmutableNamingSystem.ResourceTypeBuildStage builder() {
    return ImmutableNamingSystem.builder();
  }
}
