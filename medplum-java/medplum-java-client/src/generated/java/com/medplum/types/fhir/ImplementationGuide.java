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
    as = ImmutableImplementationGuide.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide {
  Optional<Boolean> experimental();

  Optional<Id> packageId();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<ImplementationGuide_Manifest> manifest();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<String> version();

  Optional<Markdown> copyright();

  Optional<Markdown> description();

  Optional<Meta> meta();

  Optional<List<ImplementationGuide_Global>> global();

  Optional<String> publisher();

  Optional<ImplementationGuide_Definition> definition();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> contact();

  Optional<List<ImplementationguideFhirversionItem>> fhirVersion();

  Optional<ImplementationguideLicense> license();

  Optional<String> title();

  Optional<List<UsageContext>> useContext();

  Optional<ImplementationguideStatus> status();

  Optional<DateTime> date();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<Id> id();

  Optional<String> name();

  Optional<List<ImplementationGuide_DependsOn>> dependsOn();

  Optional<Uri> url();

  static ImmutableImplementationGuide.ResourceTypeBuildStage builder() {
    return ImmutableImplementationGuide.builder();
  }
}
