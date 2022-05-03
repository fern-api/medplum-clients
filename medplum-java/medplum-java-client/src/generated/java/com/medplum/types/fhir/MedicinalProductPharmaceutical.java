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
  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<CodeableConcept> unitOfPresentation();

  List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> ingredient();

  Optional<List<Reference>> device();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept administrableDoseForm();

  String resourceType();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<MedicinalProductPharmaceutical_Characteristics>> characteristics();

  static ImmutableMedicinalProductPharmaceutical.AdministrableDoseFormBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical.builder();
  }
}
