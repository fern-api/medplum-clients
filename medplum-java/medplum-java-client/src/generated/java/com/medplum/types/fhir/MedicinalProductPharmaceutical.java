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
    as = ImmutableMedicinalProductPharmaceutical.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical {
  Optional<CodeableConcept> unitOfPresentation();

  List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> device();

  Optional<List<MedicinalProductPharmaceutical_Characteristics>> characteristics();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  String resourceType();

  CodeableConcept administrableDoseForm();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<List<Reference>> ingredient();

  static ImmutableMedicinalProductPharmaceutical.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical.builder();
  }
}
